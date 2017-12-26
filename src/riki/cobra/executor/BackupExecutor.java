package riki.cobra.executor;

import java.io.IOException;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;

import riki.cobra.Cobra;

public class BackupExecutor {
	public static void backup(Path path){
		if(Cobra.getInstance().isBackupEnabled())
			try {
				FileUtils.copyFileToDirectory(path.toFile(), Cobra.getInstance().getBackupPath().toFile());
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
	}
}
