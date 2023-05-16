function productMatrix(A, B) {
    return A.map(function(row) {
        return row.map(function(_, i) {
            return row.reduce(function(sum, cell, j) {
                return sum + cell * B[j][i];
            }, 0);
        });
    });
}