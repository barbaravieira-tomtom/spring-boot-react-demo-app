

$(document).ready(function() {
    $.ajax({
        url: "/index/"
    }).then(function(data) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.content);
    });
});