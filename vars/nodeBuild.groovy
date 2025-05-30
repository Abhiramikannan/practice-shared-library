def call(){
  sh '''
    npm install
    #if using a repo without test code
    npx jest --passWithNoTests
    #if using a repo with test code
    #npm run test
    '''
}
