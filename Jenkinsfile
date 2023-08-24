pipeline {
    agent any

    stages {
        stage('checkout') {
            steps {
                dir('aupp-demo') {
                    git credentialsId: 'github', branch: 'main', url: 'git@github.com:PkayJava/aupp-demo.git'
                }
            }
        }
        stage('compile') {
            steps {
                dir('aupp-demo') {
                    sh '''
                        export PATH="$JAVA_HOME/bin:$PATH"
                        ./gradlew bootJar
                    '''
                }
            }
        }
        stage('deploy') {
            steps {
                dir('aupp-demo') {
                    sh '''
                        docker-compose down
                        docker-compose up -d
                    '''
                }
            }
        }
    }

    post {
        cleanup {
            sh '''
                rm -rf aupp-demo
            '''
        }
    }
}
