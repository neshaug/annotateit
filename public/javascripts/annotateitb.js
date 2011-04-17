/*global
$, window, document, console
*/

/*jslint
nomen: false
*/
$(document).ready(function () {
    $.ajax({
        url: 'http://127.0.0.1:9000/notes/all',
        dataType: 'jsonp',
        success: function (data) {
            console.log(data);
        }
    });

    $('#dialog').dialog();

    function Note() {
        this._id = 0;
        this._content = null;
        this.x = 0;
        this.y = 0;
        this._xpath = null;
    }

    function NoteView() {
        this._dialog = null;
    }

    NoteView.prototype.render = function (note) {
        var div = document.createElement("div");
        this._dialog = $(div).dialog({
            position: [note.x, note.y]
        });
    };

    function clickHandler(e) {
        e.target;
        var note = new Note();
        note.x = e.clientX;
        note.y = e.clientY;
        new NoteView().render(note);
    }

    window.onclick = clickHandler;
});
