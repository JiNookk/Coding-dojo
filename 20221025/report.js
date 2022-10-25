function solution(id_list, report, k) {
    const answer = Array(id_list.length).fill(0);
     const users = [];
     const suspendedList = {};
     const idIdx = {};
 
     const set = new Set(report);
     const reports = [...set]
 
     id_list.forEach((id, index) => {
         idIdx[id] = index;
         users.push({name: id,
             reportList: [],
             reportedList: []})
     })
 
 
     reports.forEach((report => {
         const words = report.split(' ')
         users[idIdx[words[0]]].reportList.push(words[1]);
         users[idIdx[words[1]]].reportedList.push(words[0]);
     }))
 
     users.forEach(user => {
         if(user.reportedList.length >= k){
             suspendedList[user.name] = 1   
         }
     })
 
     users.forEach(user => {
         user.reportList.forEach(report => {
             if(suspendedList[report]){
                 answer[idIdx[user.name]] += 1;   
             }
         })
     })
 
     return answer;
 }