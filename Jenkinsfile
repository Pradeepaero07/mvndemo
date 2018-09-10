pipeline{
	agent any
	parameters {
        booleanParam(defaultValue: true, description: '', name: 'userFlag')
    }
	stages{
		stage('checkout'){
		
			steps{
				git 'https://github.com/Pradeepaero07/mvndemo.git'
			}
		}
		stage('Compile Stage'){
		
			steps{
				withMaven(maven: 'maven3.5.4'){
					bat 'mvn clean compile'
				}
			}
		}
		
		stage('Testing Stage'){
			steps{
				withMaven(maven: 'maven3.5.4'){
					bat 'mvn test'
				}
			}
		}
		
		stage('Deployment Stage'){
			steps{
				withMaven(maven: 'maven3.5.4'){
					//bat 'mvn deploy'
				}
				echo 'Deployment completed'
			}
		}
	}
}
