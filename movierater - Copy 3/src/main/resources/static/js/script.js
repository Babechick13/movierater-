function extracted(movieid_title) {
    const index = movieid_title.indexOf('_');
    const title = movieid_title.substr(index + 1);
    const movieId = movieid_title.substr(0, index);
    // get the like btn and dislike btn and toggle there like state
    const likeId = `${movieid_title}_like`;
    const dislikeId = `${movieid_title}_dislike`;
    const likeBtn = document.getElementById(`${likeId}`);
    const dislikeBtn = document.getElementById(`${dislikeId}`);
    return {title, movieId, likeBtn, dislikeBtn};
}

const likeMovie = async (movieid_title) => {
    const {title, movieId, likeBtn, dislikeBtn} = extracted(movieid_title);
    likeBtn.classList.replace('far', 'fa');
    dislikeBtn.classList.replace('fa', 'far');
    await fetch(`http://127.0.0.1:8080/like/${movieId}_${title}`);
};

const dislikeMovie = async (movieid_title) => {
    const {title, movieId, likeBtn, dislikeBtn} = extracted(movieid_title);
    likeBtn.classList.replace('fa', 'far');
    dislikeBtn.classList.replace('far', 'fa');
    await fetch(`http://127.0.0.1:8080/dislike/${movieId}_${title}`);
};
