pipeline {
    agent any

    stages {
        stage('clone Repository') {
            steps {
            git branch:'master',url:'https://github.com/saravanaAnusha/created_dsl.git'
            }
        }
    }
}
