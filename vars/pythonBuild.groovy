
def call(){
  sh 'python3 -m venv abhi-venv'
  sh '. abhi-venv/bin/activate'
  sh 'pip install -r requirements.txt'
}
