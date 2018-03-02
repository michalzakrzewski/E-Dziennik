$(document).ready(function () {
    $('.table .eBtn').on('click', function (event) {

        event.preventDefault(); // not send request
        var href = $(this).attr('href');

        $.get(href, function (student, status) {
            $('.myForm #id').val(student.id);
            $('.myForm #firstName').val(student.firstName);
            $('.myForm #lastName').val(student.lastName);
            $('.myForm #age').val(student.age);
            $('.myForm #degree').val(student.degree);
        });

        $('.myForm #exampleModal').modal();
    });
});