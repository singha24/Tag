pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'make package'
            }
        }
        stage('Test') {
            steps {
                echo 'make check'
            }
        }
		stage('Test Again') {
            steps {
                echo 'make check'
            }
        }
        stage('Deploy') {
            when { tag "release-*" }
            steps {
                echo 'Deploying only because this commit is tagged...'
				echo 'Hello world'
                echo 'make deploy'
            
            }
        }
    }
}