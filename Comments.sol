pragma solidity ^0.5.10;

contract Reports {
    struct Report {
        string name;
        string date;
        string sex;
        string company;
        string tall;
        string weight;
        string etc;
    }
    Report[] public reports;
    
    function getReportCount() public view returns(uint) {
        return reports.length;
    }
    
    function report(string memory _name, string memory _date, string memory _sex, string memory _emoji) public {
        posts.length++;
        posts[posts.length-1].name = _name;
        posts[posts.length-1].comment = _comment;
        posts[posts.length-1].date = _date;
        posts[posts.length-1].emoji = _emoji;
        posts[posts.length-1].show = true;
    }

    function hidePost(uint index) public {
        posts[index].show = false;
    }

    function getPost(uint index) public view returns(string memory, string memory, string memory, string memory) {
        return (posts[index].name, posts[index].comment, posts[index].date, posts[index].emoji);
    }
    
}
