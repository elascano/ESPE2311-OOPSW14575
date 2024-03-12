const hostname = '127.0.0.1';
const port = 3001;

const server = http.createServer((req,res) => {
    res.statusCode = 200;
    res.setHeader('Content-Type', 'test/html');
    res.end('<b>Hello</b>, <hr>World Programmers of 14575!')
});

server.listen(port, hostname, () => {
    console.log(`Server is running and listening on port ${port}`);
})