function getReviews(bookId) {
	fetch('/api/book/' + bookId)
		.then(response => response.json())
		.then(data => {
			document.getElementById('reviewdetails').innerHTML =
				'<p>Title: ' + data.title + '</p>' +
				'<p>Authors: ' + data.authors + '</p>';
		});


	//It takes a bit of time for the review to be displayed after you write a comment, but it still works.
	fetch('/api/book/' + bookId + '/reviews')
		.then(response => response.json())
		.then(data => {
			let reviewsHtml = '<p>Reviews:</p>';
			data.forEach(review => {
				reviewsHtml += '<p>' + review.review + '</p>';
			});

			document.getElementById('reviewdetails').innerHTML += reviewsHtml;
		});
}

