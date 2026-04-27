pipeline {
    agent any

    tools {
        jdk 'JDK'
        maven 'Maven'
    }

    stages {

        stage('Fetch Source Code') {
            steps {
                echo 'Fetching source code from Git repository...'

                git branch: 'main',
                    url: 'https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git'
            }
        }

        stage('Build Application') {
            steps {
                echo 'Building the application using Maven...'
                bat 'mvn clean compile'
            }
        }

        stage('Run Unit Tests') {
            steps {
                echo 'Executing unit test cases...'
                bat 'mvn test'
            }
        }

        stage('Package Application') {
            steps {
                echo 'Packaging the application into JAR file...'
                bat 'mvn package'
            }
        }

        stage('Archive Artifacts') {
            steps {
                echo 'Archiving generated JAR file...'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Deploy Application') {
            steps {
                echo 'Build successful. Deploying application...'
                bat 'java -jar target\\my-java-app-1.0-SNAPSHOT.jar'
            }
        }
    }

    post {
        success {
            echo 'SUCCESS: Pipeline completed successfully.'
            echo 'Build, test, package, archive, and deployment completed.'
        }

        failure {
            echo 'FAILURE: Pipeline failed.'
            echo 'Please check the Jenkins Console Output for errors.'
        }

        always {
            echo 'Pipeline execution finished.'
        }
    }
}
