class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String[] buildings = {
        "Liberal Arts",                 // 0
        "Student Services",             // 1
        "Health Careers & Sciences",    // 2
        "Health Technologies Center",   // 3
        "Recreation Center",            // 4
        "Technology Learning Center",   // 5
        "Business & Technology",        // 6
        "Theatre"                       // 7
    };
	
    // 2-Define Edges
    int[][] walkways = {
        {0, 7}, {7, 0},     // Liberal Arts - Theatre
        {0, 1}, {1, 0},     // Student Services - Liberal Arts
        {1, 2}, {2, 1},     // Student Services - Health Careers & Sciences
        {2, 3}, {3, 2},     // Health Careers & Sciences - Health Technologies Center
        {6, 7}, {7, 6},     // Business & Technology - Theatre
        {1, 6}, {6, 1},     // Liberal Arts - Business & Technology
        {1, 5}, {5, 1},     // Liberal Arts - Technology Learning Center
        {1, 4}, {4, 1},     // Liberal Arts - Recreation Center
        {2, 4}, {4, 2},     // Health Careers & Sciences - Recreation Center
    };
    
    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(buildings, walkways);

    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);
    
    // 5. Retrieve and print the search order of the DFS traversal
    System.out.println("DFS Search Order:");
    for (int index : dfs.getSearchOrder()) {
        System.out.println(index + " : " + graph.getVertex(index));
    }

    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    System.out.println("\nParent-Child Relationships:");
    for (int i = 0; i < graph.getSize(); i++) {
        int parent = dfs.getParent(i);
        if (parent != -1) {
            System.out.println(graph.getVertex(parent) + " --> " + graph.getVertex(i));
        }
    }
    
    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    System.out.println("\nPath from Business & Technology to Liberal Arts:");
    dfs.printPath(0);

    // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
    System.out.println("\nDFS Tree:");
    dfs.printTree();

  }
}