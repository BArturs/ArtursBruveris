## App set-up using CloudShell and PaaS
In this exercise an app was set-up using AWS CloudShell.

## How to
To reproduce the results of this task, go to CloudShell in the AWS and type the following 
commands:
- git clone https://github.com/aws-samples/eb-java-scorekeep.git
- cd eb-java-scorekeep
- VARDS="tavsVards" (CHANGE TO YOUR NAME)
- BUCKET_NAME=beanstalk-artifacts-$VARDS
- echo $BUCKET_NAME > bucket-name.txt
- aws s3 mb s3://$BUCKET_NAME
- sed -i "s/Scorekeep/Scorekeep-$VARDS/" template.yml
- git archive --format=zip HEAD > package.zip
- aws cloudformation package \
    --template-file template.yml \
    --s3-bucket $BUCKET_NAME \
    --output-template-file out.yml
- aws cloudformation deploy \
    --template-file out.yml \
    --stack-name scorekeep-$VARDS \
    --capabilities CAPABILITY_NAMED_IAM

## Results
![ScoreKeep Game Connection](https://ibb.co/L0FCzCr)
