def call(Map conf = [:]){
  bat "echo hello ${conf.name}. your age is ${conf.age}"
}
