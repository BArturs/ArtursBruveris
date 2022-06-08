## Amazon Simple Email Service (SES) and Lambda
In this exercise the Amazon SES was configured and a test email was sent to check how the 
service works. Then, in AWS, Lambda function was created using a script and, again, a test 
email was sent to check how the function works.

## How to on SES
- Go to Amazon SES console
- Create identity
- Identity type - email address
- Email address - your email
- Create identity
- Verify identity in your email
- Open identity, click "Send test email"
- Email format - formatted
- From-address - remains the same
- Scenario - custom
- Custom recipient - your verified email
- Subject - "Anything you want"
- Body - write your message here
- Send test email
- Check your email

## How to on Lambda
- Go to Amazon Lambda service and click Create function
- Author from scratch
- Function name - anything
- Runtime - Python 3.8
- Architecture - x86_64
- Change default execution role -> Use an existing role -> LambdaRole
- Create function
- In the code tab, replace lambda_function.py with the code from repo (Lambdafunction file)
- In the code, replace <RECIPIENT> and <SENDER> with your verified SES email.
- Deploy
- Create a test event clicking on "Test"
- Create new test event
- Event template remains the same hello-world
- Event name - Test or anything else and then click Create
- Go to Test tab, choose saved event -> Event name
- Click test and check your email

## Results
- ![SES](https://ibb.co/jy7mTTq)
- ![LAMBDA](https://ibb.co/T1vJ7GT)
