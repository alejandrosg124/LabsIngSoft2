import express from 'express';

const app = express();
const port = 3000;

app.get('/Api1', (req, res) => {
    res.send('Hello World!1')
  })
  
  app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
  })