pipeline {
    agent any

    stages {
        stage('clone Repository') {
            steps {
            git branch:'master'
            }
        }
    }
}
