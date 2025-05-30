def call(){
  sh '''
    npm install
    npm set-script test "jest --passWithNoTests"
    npm run test
    '''
}
