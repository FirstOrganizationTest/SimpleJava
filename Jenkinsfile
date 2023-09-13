node {
        stage('SCM') {
                checkout scm
        }
	
        stage('SQ-10.2') {
                
                withSonarQubeEnv('SQ-10.2') {
			          bat "mvn clean verify sonar:sonar -Dsonar.token=squ_444ce5cf257932e2b0cf53c35cdb2cd59759f783 -Dsonar.projectKey=SUPPORT---40845"
                }
        }
}
