import express from 'express';

const app = express();
const port = 3001;

app.get('/Api2', (req, res) => {
    res.send('Hello World2!')
  })
  
  app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
  })