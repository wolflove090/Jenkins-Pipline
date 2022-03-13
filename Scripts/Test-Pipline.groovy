
pipeline {
    agent any
    triggers
    {
        cron("H 0-6 * * *")
        
    }
    stages {
        stage('Example Build') {
            steps {
                echo "Test"
                Hogehoge()
            }
        }
    }
}