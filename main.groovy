job('Seed cicdTest01') {
  scm {
    git ('https://github.com/buturupuinc/cicdtest01.git')
  }
  steps {
    dsl {
      external('*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}
pipelineJob("pipeline-running-terraform") {
  scm {
    git ('https://github.com/buturupuinc/cicdtest02.git')
  }
  logRotator{
        numToKeep 30
    }
    definition {
        cps {
            sandbox()
            script("""
                node {
                    stage 'Build Cloud'
                    bat 'command.bat'
                }
            """.stripIndent())
        }
    }
}
