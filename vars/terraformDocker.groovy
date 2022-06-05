import com.eshiti.utilities

def call(Closure body) {
  def utils = new Utilities(this)
  node(any) {
    def utils = new Utilities()
    stage('Tests') {
      echo 'Tests...'
    }
    stage('Build') {
      echo 'Build...'
    }
    stage('Push') {
      echo 'Push'
    }
  }
}