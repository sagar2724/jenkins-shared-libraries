def call(string ProjectName, string ImageTag, string DockerHuabUser){
 sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
