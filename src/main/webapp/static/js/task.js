jQuery(function($) {
	$('body').on('click', 'a.menu-link', function(evt) {
		evt.preventDefault();
		var href = $(this).attr('href');
		$('#main-div').load(href);
	});

	$('body').on('submit', 'form.ajax-form', function(evt) {
		evt.preventDefault();
		console.log(this)
		var url = $(this).attr('action');
		$.ajax(url, {
			cache : false,
			processData : false,
			contentType : false,
			data : new FormData(this),
			type : 'post',
			success : function(rt) {
				$('#main-div').html(rt);
			}
		});
	});

});