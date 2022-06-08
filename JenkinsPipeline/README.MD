## Jenkins pipeline exercise

In this exercise Jenkins was set up on an EC2 instance in AWS to run a pipeline using Jenkins.
This pipeline consists of 3 stages:
- Pull - for use of git repository in the pipeline;
- Test - uses the unit tests written for calculator.java file from calculatorTest.java to test the code;
- Build - builds the calculator.java code.

## How to
Standart pipeline was made with SCM poll every minute (not necessary) and the Jenkinsfile (from this repo's folder "JenkinsPipeline") 
script was added in the pipeline. Afterwards, build/run the pipeline.

## Results
- ![Jenkins ready to use](https://ibb.co/HqqD7PC)
- ![SCM](https://ibb.co/Tck2Mk5)
- ![Pipeline Output](https://ibb.co/kDzXKV7)
