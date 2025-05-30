def call(){
  sh '''
    npm install
    npx jest --passWithNoTests
    #npm run test
    '''
}
