
def call(){
  sh 'python3 -m venv abhi-venv'
  sh '. abhi-venv/bin/activate'
  sh 'apt install python3-pip'
  sh 'pip install -r requirements.txt'
}
