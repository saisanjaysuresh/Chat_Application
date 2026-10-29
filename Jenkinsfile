
pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Building Chat App branch: ${env.BRANCH_NAME ?: 'V1'}"
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }
    }

    post {
        success {
            echo 'Chat App build and tests completed successfully!'
        }
        failure {
            echo 'Build failed. Check the console output.'
        }
    }
}
