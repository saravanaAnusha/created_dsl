 pipeline {
    agent any

    stages {
        stage('Git checkout') {
            steps {
             git branch:'master' url{ ['https://github.com/saravanaAnusha/created_dsl/blob/master/saravana_dsl.groovy']}
            }
        }
    }
}
