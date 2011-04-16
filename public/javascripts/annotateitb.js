$(document).ready(function() {
    $.ajax({
        url: "http://127.0.0.1:9000/notes/all",
        dataType: "jsonp",
        success: function(data) {
            console.log(data);
        }
    });
});