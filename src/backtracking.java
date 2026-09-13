import java.util.ArrayList;

public class backtracking{
    void solve(int[][]maze , int SrcX ,int SrcY,int destX,int destY , boolean[][],ArrayList<String> ans,String path){
        if(SrcX==destX && srcY==destY){
            ans.add(path);
            return ;
        }
         visited[Src][SrcY] = true;
         int newX=srcX -1;
         int newY=srcY;
         if(isSafetomove(newX, newY)){
           solve(maze,SrcX,SrcY,destX,destY,visited,ans,path +"U")
        }

        
    }
   
    
    public ArrayList<String> ratInMaze(int[][]maze){
        int SrcX=0;
        int SrcY =0;
        int n= maze.length;
        int destX=n-1;
        int destY=n-1;
        boolean[][]visited=new boolean [n][n];
        ArrayList<String>ans=new ArrayList<>();
        String path= "";

        if(maze[0][0]==0 || maze[n-1][n-1]==0){
  return ans;
        }
  solve(maze,SrcX,SrcY,destX,destY,visited,ans,path);
return ans;
    }
}