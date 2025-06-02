
def call(){
 sh 'python3 -m venv abhi-venv'
  sh '. abhi-venv/bin/activate'
  sh 'cd abhi-venv'
  sh 'apt install python3-pip'
  sh 'abhi-venv/bin/pip install -r requirements.txt'
}
