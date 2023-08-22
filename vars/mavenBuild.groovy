def call(){
  tool name: 'MAVEN_HOME', type: 'maven'
  sh 'mvn clean install'
}
