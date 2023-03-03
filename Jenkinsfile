pipeline {
  agent any
  stages {
    stage('build') {
      parallel {
        stage('build') {
          steps {
            sh 'mvn clean test'
          }
        }

        stage('version') {
          steps {
            sh 'mvn --version'
          }
        }

      }
    }

  }
}