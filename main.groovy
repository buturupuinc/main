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
job('Seed cicdTest02') {
  scm {
  git ('https://github.com/buturupuinc/cicdtest02.git')
  }
steps {
  dsl {
  external('*.groovy')
  // default behavior
  // removeAction('IGNORE')
  removeAction('DELETE')
  }
}
