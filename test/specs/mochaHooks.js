describe('Primer Suite', () => {
    before('Before', () => {
        console.log('Bofore hook')
    })

    beforeEach('Before Each', () => {
        console.log('Bofore Each hook')
    })

    it('Primer Test Case', () => {
        console.log('Primer Test Case')
    })
    
    it('Segundo Test Case', () => {
        console.log('Segundo Test Case')
    })

    after('After Each', () => {
        console.log('After Each hook')
    })

    after('After', () => {
        console.log('After hook')
    })
})