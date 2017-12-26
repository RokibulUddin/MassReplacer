package riki.cobra.executor.replace;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ReplaceExecutor{
	protected List<ReplaceInfo> infos;	
	protected Charset charset = StandardCharsets.UTF_8;
	private ExecutorService executor = Executors.newCachedThreadPool();

	public ReplaceExecutor() {
		infos = new LinkedList<>();
	}
	
	public ReplaceExecutor(List<ReplaceInfo> infos) {
		this.infos = infos;
	}
	
	public void addReplaceInst(String replace, String with) {
		infos.add(new ReplaceInfo(replace, with));
	}
	
	public void addReplaceInst(List<String> replace, String with) {
		infos.add(new ReplaceInfo(replace, with));
	}
	
	public void setCharset(Charset charset) {
		this.charset = charset;
	}

	public void replace(Replacer replacer) {
		executor.execute(() -> replacer.replace(infos));	
	}
	
	public void shutdown() {
		executor.shutdown();
		try {
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
