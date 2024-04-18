def dummySteps(name) {
  echo "Dummy building app named ${name} ..."
  sh 'echo "HOME=$HOME" '
  sh 'sleep 2'
  echo 'Dummy build complete !'
}

return this
