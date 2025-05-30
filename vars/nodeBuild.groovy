def call(){
  sh '''
    npm install
    npm run test
    '''
}
