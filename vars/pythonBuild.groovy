def call(){
  sh 'python3 -m install venv abhi-venv'
  sh 'abhi-venv/bin/activate'
  sh 'pip install -r requirements.txt'
}
