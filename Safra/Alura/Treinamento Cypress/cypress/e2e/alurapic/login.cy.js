describe('Login de usuários alura pic', () => {
    beforeEach(() => {
        cy.visit('https://alura-fotos.herokuapp.com');
    })

    it('fazer login de usuario valido', () => {
        cy.login('flavio','123')
        cy.contains('a','(Logout)').should('be.visible');
    })
    
    it('fazer login de usuario invalido', () => {
        cy.login('marco','1234')
        cy.on('window.alert',(str)=>{
            expect(str).to.equal('Invalid user name or password')
        })
    })
})