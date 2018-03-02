$(document).ready(function () {
    $('.nBtn, .table .eBtn').on('click', function (event) {

        event.preventDefault(); // not send request
        var href = $(this).attr('href');
        var text = $(this).text();

        if (text == 'Edit'){

            $.get(href, function (student, status) {
                $('.myForm #id').val(student.id);
                $('.myForm #firstName').val(student.firstName);
                $('.myForm #lastName').val(student.lastName);
                $('.myForm #age').val(student.age);
                $('.myForm #degree').val(student.degree);
            });

            $('.myForm #exampleModal').modal();
        }else {
            $('.myForm #id').val('');
            $('.myForm #firstName').val('');
            $('.myForm #lastName').val();
            $('.myForm #age').val('');
            $('.myForm #degree').val('');
            $('.myForm #exampleModal').modal();
        }
    });

    $('.table .delBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href', href);

        $('#myModal').modal();

    });
});