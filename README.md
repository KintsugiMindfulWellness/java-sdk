# Kintsugi Java SDK

Java SDK to access Kintsugi Voice API V2.

## Usage
Take a look on how to configure it in your project and use its features.

### Maven dependency
First, add the Kintsugi Health Github repository to the list of Maven enabled repositories on settings.xml file:

```
<repository>
    <id>kintsugi</id>
    <url>https://maven.pkg.github.com/KintsugiMindfulWellness/java-sdk</url>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```

Then, add it as dependency to pom.xml file:

```
<dependencies>
    <dependency>
        <groupId>com.kintsugi</groupId>
        <artifactId>java-sdk</artifactId>
        <version>${kintsugi-java-sdk-version}</version>
    </dependency>
</dependencies>
```

### Code Example

```
package com.kintsugi.client.example;

import com.kintsugi.client.Api;
import com.kintsugi.client.openapi.invoker.ApiException;
import com.kintsugi.client.openapi.model.*;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Improved {
    public static void main(String[] args) throws ApiException {
        //Configuration parameters
        String xApiKey = System.getenv("X_API_KEY");
        String userId = System.getenv("USER_ID");

        //Arguments
        File audioFile = new File("/Users/jackson/Downloads/test_audio.wav");
        int allowedSampleRate = 44100;
        SessionSessionMetadata metadata = new SessionSessionMetadata()
                .age(39)
                .gender(SessionGender.MALE_GENDER);

        //API instantiation
        Api api = new Api(xApiKey);

        //Prediction using all arguments
        api.prediction().predict(userId, audioFile, metadata, allowedSampleRate);

        //Prediction using fewer arguments
        String sessionId = api.prediction().predict(userId, audioFile);
        System.out.println("Prediction SessionId: " + sessionId);

        //Get prediction by session ID
        PredictResponsePredictionRecordBySession predictionBySession = api.prediction().getPredictionBySession(sessionId);
        while("processing".equals(predictionBySession.getStatus())) {
                Thread.sleep(5000);
                predictionBySession = api.prediction().getPredictionBySession(sessionId);
        }
        System.out.println(predictionBySession);

        //Get prediction by user ID
        List<PredictResponsePredictionRecord> predictionsByUser = api.prediction().getPredictionsByUser(userId);
        while("processing".equals(predictionByUser.getStatus())) {
                Thread.sleep(5000);
                predictionsByUser = api.prediction().getPredictionsByUser(userId);
        }
        System.out.println(predictionsByUser);

        //Depression feedback
        api.feedback().depression(sessionId, true);

        //PHQ-2 feedback
        List<PredictionValidFeedbackInt> answersPHQ2 = Arrays.asList(
                PredictionValidFeedbackInt.FeebackVal0,
                PredictionValidFeedbackInt.FeebackVal1
        );
        api.feedback().phq2(sessionId, answersPHQ2);

        //PHQ-9 feedback
        List<PredictionValidFeedbackInt> answersPHQ9 = Arrays.asList(
                PredictionValidFeedbackInt.FeebackVal1,
                PredictionValidFeedbackInt.FeebackVal2,
                PredictionValidFeedbackInt.FeebackVal0,
                PredictionValidFeedbackInt.FeebackVal1,
                PredictionValidFeedbackInt.FeebackVal2,
                PredictionValidFeedbackInt.FeebackVal0,
                PredictionValidFeedbackInt.FeebackVal1,
                PredictionValidFeedbackInt.FeebackVal2,
                PredictionValidFeedbackInt.FeebackVal0
        );
        api.feedback().phq9(sessionId, answersPHQ9);
        
        //GAD-7 feedback
        List<PredictionValidFeedbackInt> answersGAD7 = Arrays.asList(
                PredictionValidFeedbackInt.FeebackVal1,
                PredictionValidFeedbackInt.FeebackVal2,
                PredictionValidFeedbackInt.FeebackVal0,
                PredictionValidFeedbackInt.FeebackVal1,
                PredictionValidFeedbackInt.FeebackVal2,
                PredictionValidFeedbackInt.FeebackVal0,
                PredictionValidFeedbackInt.FeebackVal1
        );
        api.feedback().gad7(sessionId, answersGAD7);
    }
}
```
