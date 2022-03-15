const superagent = require('superagent')

const getMovies = () => {
    let response = superagent.get('https://ghibliapi.herokuapp.com/films')
    response.body.forEach(movie => {
        console.log('Titulo: ' + movie.title + ', Estreno: ' + movie.release_date)
    });
}

getMovies()