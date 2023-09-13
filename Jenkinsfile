node {
        stage('SCM') {
                checkout scm
        }
	
        stage('SQ-10.2') {
                
                withSonarQubeEnv('SQ-10.2') {
			          bat "mvn clean verify sonar:sonar -Dsonar.login=c230d799d3d81df8d7206cab9bfeb7edc87445d8"
                }
        }
}
stage("Quality Gate") {
        timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
                def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
                if (qg.status != 'OK') {
                        error "Pipeline aborted due to quality gate failure: ${qg.status}"
                }
        }
}
