def call(String ProjectName, String ImageTag, String DockerHuabUser){
 sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
