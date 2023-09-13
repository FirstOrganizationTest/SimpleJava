node {
        stage('SCM') {
                checkout scm
        }
	
        stage('SQ-10.2') {
                
                withSonarQubeEnv('SQ-10.2') {
			          bat "mvn clean verify sonar:sonar -Dsonar.token=squ_62effd2dced691d9474c3dfbcd4826fcd63517c0 -Dsonar.projectKey=SUPPORT---40845"
                }
        }
}
